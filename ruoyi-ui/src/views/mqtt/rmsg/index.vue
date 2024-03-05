<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-descriptions class="margin-top" title="MQTT" :column="3" :size="size" border>
        <el-descriptions-item>
          <template slot="label">
            <i class="el-icon-user"></i>
            当前时间
          </template>
          {{newDate}}
        </el-descriptions-item>
        <el-descriptions-item>
          <template slot="label">
            <i class="el-icon-user"></i>
            topic
          </template>
          {{mqttdate.topic}}
        </el-descriptions-item>
        <el-descriptions-item>
          <template slot="label">
            <i class="el-icon-office-building"></i>
            qos
          </template>
          {{mqttdate.qos}}
        </el-descriptions-item>
        <el-descriptions-item>
          <template slot="label">
            <i class="el-icon-office-building"></i>
            msg
          </template>
          {{mqttdate.msg}}
        </el-descriptions-item>
      </el-descriptions>
<!--      <el-form-item label="主题" prop="topic">-->
<!--        <el-input-->
<!--          v-model="queryParams.topic"-->
<!--          placeholder="请输入主题"-->
<!--          clearable-->
<!--          @keyup.enter.native="handleQuery"-->
<!--        />-->
<!--      </el-form-item>-->
<!--      <el-form-item label="qos" prop="qos">-->
<!--        <el-input-->
<!--          v-model="queryParams.topic"-->
<!--          placeholder="请输入qos"-->
<!--          clearable-->
<!--          @keyup.enter.native="handleQuery"-->
<!--        />-->
<!--      </el-form-item>-->
<!--      <el-form-item>-->
<!--        <el-button type="primary" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>-->
<!--        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>-->
<!--      </el-form-item>-->
    </el-form>

<!--    <el-row :gutter="10" class="mb8">-->
<!--      <el-col :span="1.5">-->
<!--        <el-button-->
<!--          type="primary"-->
<!--          plain-->
<!--          icon="el-icon-plus"-->
<!--          size="mini"-->
<!--          @click="handleAdd"-->
<!--          v-hasPermi="['mqtt:rmsg:add']"-->
<!--        >新增</el-button>-->
<!--      </el-col>-->
<!--      <el-col :span="1.5">-->
<!--        <el-button-->
<!--          type="success"-->
<!--          plain-->
<!--          icon="el-icon-edit"-->
<!--          size="mini"-->
<!--          :disabled="single"-->
<!--          @click="handleUpdate"-->
<!--          v-hasPermi="['mqtt:rmsg:edit']"-->
<!--        >修改</el-button>-->
<!--      </el-col>-->
<!--      <el-col :span="1.5">-->
<!--        <el-button-->
<!--          type="danger"-->
<!--          plain-->
<!--          icon="el-icon-delete"-->
<!--          size="mini"-->
<!--          :disabled="multiple"-->
<!--          @click="handleDelete"-->
<!--          v-hasPermi="['mqtt:rmsg:remove']"-->
<!--        >删除</el-button>-->
<!--      </el-col>-->
<!--      <el-col :span="1.5">-->
<!--        <el-button-->
<!--          type="warning"-->
<!--          plain-->
<!--          icon="el-icon-download"-->
<!--          size="mini"-->
<!--          @click="handleExport"-->
<!--          v-hasPermi="['mqtt:rmsg:export']"-->
<!--        >导出</el-button>-->
<!--      </el-col>-->
<!--      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>-->
<!--    </el-row>-->

<!--    <el-table v-loading="loading" :data="rmsgList" @selection-change="handleSelectionChange">-->
<!--      <el-table-column type="selection" width="55" align="center" />-->
<!--      <el-table-column label="时间" align="center" prop="createTime" />-->
<!--      <el-table-column label="主题" align="center" prop="topic" />-->
<!--      <el-table-column label="Qos" align="center" prop="qos" />-->
<!--      <el-table-column label="信息" align="center" prop="msg" />-->
<!--      <el-table-column label="备注" align="center" prop="remark" />-->
<!--      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">-->
<!--        <template slot-scope="scope">-->
<!--          <el-button-->
<!--            size="mini"-->
<!--            type="text"-->
<!--            icon="el-icon-edit"-->
<!--            @click="handleUpdate(scope.row)"-->
<!--            v-hasPermi="['mqtt:rmsg:edit']"-->
<!--          >修改</el-button>-->
<!--          <el-button-->
<!--            size="mini"-->
<!--            type="text"-->
<!--            icon="el-icon-delete"-->
<!--            @click="handleDelete(scope.row)"-->
<!--            v-hasPermi="['mqtt:rmsg:remove']"-->
<!--          >删除</el-button>-->
<!--        </template>-->
<!--      </el-table-column>-->
<!--    </el-table>-->

<!--    <pagination-->
<!--      v-show="total>0"-->
<!--      :total="total"-->
<!--      :page.sync="queryParams.pageNum"-->
<!--      :limit.sync="queryParams.pageSize"-->
<!--      @pagination="getList"-->
<!--    />-->

<!--    &lt;!&ndash; 添加或修改mqtt接收测试对话框 &ndash;&gt;-->
<!--    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>-->
<!--      <el-form ref="form" :model="form" :rules="rules" label-width="80px">-->
<!--        <el-form-item label="主题" prop="topic">-->
<!--          <el-input v-model="form.topic" type="textarea" placeholder="请输入内容" />-->
<!--        </el-form-item>-->
<!--        <el-form-item label="Qos" prop="qos">-->
<!--          <el-input v-model="form.qos" type="textarea" placeholder="请输入内容" />-->
<!--        </el-form-item>-->
<!--        <el-form-item label="信息" prop="msg">-->
<!--          <el-input v-model="form.msg" type="textarea" placeholder="请输入内容" />-->
<!--        </el-form-item>-->
<!--        <el-form-item label="备注" prop="remark">-->
<!--          <el-input v-model="form.remark" type="textarea" placeholder="请输入内容" />-->
<!--        </el-form-item>-->
<!--      </el-form>-->
<!--      <div slot="footer" class="dialog-footer">-->
<!--        <el-button type="primary" @click="submitForm">确 定</el-button>-->
<!--        <el-button @click="cancel">取 消</el-button>-->
<!--      </div>-->
<!--    </el-dialog>-->
  </div>
</template>

<script>
import { listRmsg, getRmsg, delRmsg, addRmsg, updateRmsg } from "@/api/mqtt/rmsg";
import { sendmqttmsg, getmqttmsg } from "@/api/mqtt/sendrece";
export default {
  name: "Rmsg",
  data() {
    return {
      // 当前时间
      newDate: new Date(),
      mqttdate:[],
      lastmqttdate:[],
      // 遮罩层
      loading: true,
      // 选中数组
      ids: [],
      // 非单个禁用
      single: true,
      // 非多个禁用
      multiple: true,
      // 显示搜索条件
      showSearch: true,
      // 总条数
      total: 0,
      // mqtt接收测试表格数据
      rmsgList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        topic: null,
        qos: null,
        msg: null,
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
      }
    };
  },
  created() {
    this.getList();
    this.getmqttdate();
    // this.getrmsglist();
  },
  watch: {
    // mqttdate: {
    //   handler(newName,oldName) {
    //     console.log(oldName)
    //     console.log(newName)
    //     console.log("1")
    //   },
    //   immediate: true,
    //   deep: true
    // }
  },
  computed: {
    // 计算属性
    getmqttdate: function () {
      return this.mqttdate.msg;
    }
  },
  mounted() {
    let that = this
    this.timer = setInterval(function () {
      that.newDate = new Date().toLocaleString()
    })
    setInterval(function () {
      that.loading = true;
      getmqttmsg().then(response => {
        if(response !=null && response != that.lastmqttdate){
          if(response.msg !="close"){
            that.mqttdate =  response;
            that.lastmqttdate = that.mqttdate;
          }
        }
        // console.log(response);
        // this.rmsgList = response.rows;
        // this.total = response.total;
      });
      that.loading = false;
      // getmqttmsg().then(response => {
      //   // this.loading = true;
      //   this.loading = true;
      //   console.log("前");
      //   console.log(this.mqttdate);
      //   this.mqttdate =  response;
      //   console.log("后");
      //   console.log(this.mqttdate);
      //   this.loading = false;
      // });
    },1500)
  },
// 销毁时清除计时器
  beforeDestroy: function () {
    if (this.timer) {
      clearInterval(this.timer)
    }
    },
  methods: {
    getmqttdate(){
      this.loading = true;
      getmqttmsg().then(response => {
        this.mqttdate =  response;
        console.log(response);
        // this.rmsgList = response.rows;
        // this.total = response.total;
        this.loading = false;
      });
    },
    getrmsglist(){
      this.loading = true;
      getmqttmsg().then(response => {
        this.form.msg = response.msg;
        this.form.topic = response.topic;
        this.form.qos = response.qos;
        console.log(response);
        // this.rmsgList = response.rows;
        // this.total = response.total;
        this.loading = false;
      });
    },
    /** 查询mqtt接收测试列表 */
    getList() {
      this.loading = true;
      listRmsg(this.queryParams).then(response => {
        this.rmsgList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    // 取消按钮
    cancel() {
      this.open = false;
      this.reset();
    },
    // 表单重置
    reset() {
      this.form = {
        id: null,
        topic: null,
        qos: null,
        msg: null,
        updateTime: null,
        updateBy: null,
        createTime: null,
        createBy: null,
        remark: null
      };
      this.resetForm("form");
    },
    /** 搜索按钮操作 */
    handleQuery() {
      this.queryParams.pageNum = 1;
      this.getList();
    },
    /** 重置按钮操作 */
    resetQuery() {
      this.resetForm("queryForm");
      this.handleQuery();
    },
    // 多选框选中数据
    handleSelectionChange(selection) {
      this.ids = selection.map(item => item.id)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加mqtt接收测试";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getRmsg(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改mqtt接收测试";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateRmsg(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addRmsg(this.form).then(response => {
              this.$modal.msgSuccess("新增成功");
              this.open = false;
              this.getList();
            });
          }
        }
      });
    },
    /** 删除按钮操作 */
    handleDelete(row) {
      const ids = row.id || this.ids;
      this.$modal.confirm('是否确认删除mqtt接收测试编号为"' + ids + '"的数据项？').then(function() {
        return delRmsg(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('mqtt/rmsg/export', {
        ...this.queryParams
      }, `rmsg_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
