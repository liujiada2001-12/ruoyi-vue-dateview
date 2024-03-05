let option = {
title: {
text: '折线图堆叠'
},
tooltip: {
trigger: 'axis'
},
legend: {
data: ['邮件营销', '联盟广告', '视频广告', '直接访问', '搜索引擎']
},
grid: {
left: '3%',
right: '4%',
bottom: '3%',
containLabel: true
},
xAxis: {
type: 'category',
boundaryGap: false,
data: this.xAxisData // x轴数据
},
yAxis: {
type: 'value'
},
series: [
{
name: '邮件营销',
type: 'line',
stack: '总量',
data: this.yAxisData1 // y轴数据1
},
{
name: '联盟广告',
type: 'line',
stack: '总量',
data: this.yAxisData2 // y轴数据2
},
{
name: '视频广告',
type: 'line',
stack: '总量',
data: this.yAxisData3 // y轴数据3
},
{
name: '直接访问',
type: 'line',
stack: '总量',
data: this.yAxisData4 // y轴数据5
},
{
name: '搜索引擎',
type: 'line',
stack: '总量',
data: this.yAxisData5 // y轴数据5
}
]
}
<!--<template>-->
<!--  <div>-->
<!--    <div ref="chart" style="width:50%;height:376px"></div>-->
<!--    <div ref="chart1" style="width:50%;height:376px"></div>-->
<!--  </div>-->

<!--</template>-->

<!--<script>-->

<!--export default {-->
<!--  data() {-->

<!--  },-->
<!--  mounted() {-->
<!--    this.getEchartData()-->
<!--    this.getEchartData1()-->

<!--  },-->
<!--  methods: {-->
<!--    getEchartData() {-->
<!--      const chart = this.$refs.chart-->
<!--      if (chart) {-->
<!--        const myChart = this.$echarts.init(chart)-->
<!--        const option = { legend: {},-->
<!--          tooltip: {},-->
<!--          dataset: {-->
<!--            source: [-->

<!--              ['订单', 43.3, 85.8],-->
<!--              ['订单1', 83.1, 73.4],-->
<!--              ['订单2', 86.4, 65.2],-->
<!--              ['订单3', 72.4, 53.9],-->
<!--              ['订单4', 82.4, 53.9],-->
<!--              ['订单5', 42.4, 53.9],-->
<!--              ['订单6', 72.4, 53.9],-->
<!--              ['订单7', 72.4, 53.9]-->
<!--            ]-->
<!--          },-->
<!--          xAxis: { type: 'category' },-->
<!--          yAxis: {},-->

<!--          series: [ { type: 'bar' }, { type: 'bar' }]}-->
<!--        myChart.setOption(option)-->
<!--        window.addEventListener("resize", function() {-->
<!--          myChart.resize()-->
<!--        })-->
<!--      }-->
<!--      this.$on('hook:destroyed',()=>{-->
<!--        window.removeEventListener("resize", function() {-->
<!--          myChart.resize();-->
<!--        });-->
<!--      })-->
<!--    },-->
<!--    getEchartData1() {-->
<!--      const chart1 = this.$refs.chart1-->
<!--      if (chart1) {-->
<!--        const myChart = this.$echarts.init(chart1)-->
<!--        const option = {-->
<!--          title: {-->
<!--            text: 'Stacked Line'-->
<!--          },-->
<!--          tooltip: {-->
<!--            trigger: 'axis'-->
<!--          },-->
<!--          legend: {-->
<!--            data: ['Email', 'Union Ads', 'Video Ads', 'Direct', 'Search Engine']-->
<!--          },-->
<!--          grid: {-->
<!--            left: '3%',-->
<!--            right: '4%',-->
<!--            bottom: '3%',-->
<!--            containLabel: true-->
<!--          },-->
<!--          toolbox: {-->
<!--            feature: {-->
<!--              saveAsImage: {}-->
<!--            }-->
<!--          },-->
<!--          xAxis: {-->
<!--            type: 'category',-->
<!--            boundaryGap: false,-->
<!--            data: ['一月', '二月', '三月', '四月', '五月', '六月', '七月','八月','九月','十月','十一月','十二月']-->
<!--          },-->
<!--          yAxis: {-->
<!--            type: 'value'-->
<!--          },-->
<!--          series: [-->
<!--            {-->
<!--              name: 'Email',-->
<!--              type: 'line',-->
<!--              stack: 'Total',-->
<!--              data: [120, 132, 101, 134, 90, 230, 210,120, 132, 101, 134, 90, 230]-->
<!--            },-->
<!--            {-->
<!--              name: 'Union Ads',-->
<!--              type: 'line',-->
<!--              stack: 'Total',-->
<!--              data: [220, 182, 191, 234, 290, 330, 310,220, 182, 191, 234, 290, 330]-->
<!--            },-->
<!--            {-->
<!--              name: 'Video Ads',-->
<!--              type: 'line',-->
<!--              stack: 'Total',-->
<!--              data: [150, 232, 201, 154, 190, 330, 410,150, 232, 201, 154, 190, 330]-->
<!--            },-->
<!--            {-->
<!--              name: 'Direct',-->
<!--              type: 'line',-->
<!--              stack: 'Total',-->
<!--              data: [320, 332, 301, 334, 390, 330, 320,320, 332, 301, 334, 390, 330]-->
<!--            },-->
<!--            {-->
<!--              name: 'Search Engine',-->
<!--              type: 'line',-->
<!--              stack: 'Total',-->
<!--              data: [820, 932, 901, 934, 1290, 1330, 1320,820, 932, 901, 934, 1290, 1330]-->
<!--            }-->
<!--          ]-->

<!--        }-->
<!--        myChart.setOption(option)-->
<!--        window.addEventListener("resize", function() {-->
<!--          myChart.resize()-->
<!--        })-->
<!--      }-->
<!--      this.$on('hook:destroyed',()=>{-->
<!--        window.removeEventListener("resize", function() {-->
<!--          myChart.resize();-->
<!--        });-->
<!--      })-->
<!--    },-->


<!--  },-->
<!--  watch: {},-->
<!--  created() {-->
<!--  }-->
<!--}-->
<!--</script>-->

































<!--<template>-->
<!--  <div class="app-container">-->
<!--&lt;!&ndash;    <div id="chart1" style="width: 600px;height:400px;">11111111</div>&ndash;&gt;-->
<!--    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">-->
<!--      <el-form-item label="采集时间" prop="time">-->
<!--        <el-date-picker clearable-->
<!--          v-model="queryParams.time"-->
<!--          type="date"-->
<!--          value-format="yyyy-MM-dd"-->
<!--          placeholder="请选择采集时间">-->
<!--        </el-date-picker>-->
<!--      </el-form-item>-->
<!--      <el-form-item label="数据类型" prop="dateCategory">-->
<!--        <el-input-->
<!--          v-model="queryParams.dateCategory"-->
<!--          placeholder="请输入数据类型"-->
<!--          clearable-->
<!--          @keyup.enter.native="handleQuery"-->
<!--        />-->
<!--      </el-form-item>-->
<!--      <el-form-item label="值" prop="value">-->
<!--        <el-input-->
<!--          v-model="queryParams.value"-->
<!--          placeholder="请输入值"-->
<!--          clearable-->
<!--          @keyup.enter.native="handleQuery"-->
<!--        />-->
<!--      </el-form-item>-->
<!--      <el-form-item label="数值类型" prop="valueCategory">-->
<!--&lt;!&ndash;        <el-input&ndash;&gt;-->
<!--&lt;!&ndash;          v-model="queryParams.valueCategory"&ndash;&gt;-->
<!--&lt;!&ndash;          placeholder="请输入数值类型"&ndash;&gt;-->
<!--&lt;!&ndash;          clearable&ndash;&gt;-->
<!--&lt;!&ndash;          @keyup.enter.native="handleQuery"&ndash;&gt;-->
<!--&lt;!&ndash;        />&ndash;&gt;-->
<!--        <el-select v-model="queryParams.valueCategory"-->
<!--                   filterable placeholder="请输入数值类型"-->
<!--                   clearable-->
<!--                   @keyup.enter.native="handleQuery">-->
<!--        <el-option-->
<!--          v-for="item in valueCategoryoptions"-->
<!--          :key="item.id"-->
<!--          :label="item.valueCategoryName"-->
<!--          :value="item.id">-->
<!--        </el-option>-->
<!--        </el-select>-->
<!--      </el-form-item>-->
<!--      <el-form-item>-->
<!--        <el-button type="primary" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>-->
<!--        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>-->
<!--      </el-form-item>-->
<!--    </el-form>-->

<!--    <el-row :gutter="10" class="mb8">-->
<!--      <el-col :span="1.5">-->
<!--        <el-button-->
<!--          type="primary"-->
<!--          plain-->
<!--          icon="el-icon-plus"-->
<!--          size="mini"-->
<!--          @click="handleAdd"-->
<!--          v-hasPermi="['date:statistics:add']"-->
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
<!--          v-hasPermi="['date:statistics:edit']"-->
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
<!--          v-hasPermi="['date:statistics:remove']"-->
<!--        >删除</el-button>-->
<!--      </el-col>-->
<!--      <el-col :span="1.5">-->
<!--        <el-button-->
<!--          type="warning"-->
<!--          plain-->
<!--          icon="el-icon-download"-->
<!--          size="mini"-->
<!--          @click="handleExport"-->
<!--          v-hasPermi="['date:statistics:export']"-->
<!--        >导出</el-button>-->
<!--      </el-col>-->
<!--      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>-->
<!--    </el-row>-->

<!--    <el-table v-loading="loading" :data="statisticsList" @selection-change="handleSelectionChange">-->
<!--      <el-table-column type="selection" width="55" align="center" />-->
<!--      <el-table-column label="采集时间" align="center" prop="time" width="180">-->
<!--        <template slot-scope="scope">-->
<!--          <span>{{ parseTime(scope.row.time, '{y}-{m}-{d}') }}</span>-->
<!--        </template>-->
<!--      </el-table-column>-->
<!--      <el-table-column label="数据类型" align="center" prop="dateCategoryName" />-->
<!--      <el-table-column label="值" align="center" prop="value" />-->
<!--      <el-table-column label="数值类型" align="center" prop="valueCategory" />-->
<!--      <el-table-column label="备注" align="center" prop="remark" />-->
<!--      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">-->
<!--        <template slot-scope="scope">-->
<!--          <el-button-->
<!--            size="mini"-->
<!--            type="text"-->
<!--            icon="el-icon-edit"-->
<!--            @click="handleUpdate(scope.row)"-->
<!--            v-hasPermi="['date:statistics:edit']"-->
<!--          >修改</el-button>-->
<!--          <el-button-->
<!--            size="mini"-->
<!--            type="text"-->
<!--            icon="el-icon-delete"-->
<!--            @click="handleDelete(scope.row)"-->
<!--            v-hasPermi="['date:statistics:remove']"-->
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

<!--    &lt;!&ndash; 添加或修改最新平均值对话框 &ndash;&gt;-->
<!--    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>-->
<!--      <el-form ref="form" :model="form" :rules="rules" label-width="80px">-->
<!--&lt;!&ndash;        <el-form-item label="序号" prop="id">&ndash;&gt;-->
<!--&lt;!&ndash;          <el-input v-model="form.id" placeholder="请输入序号" />&ndash;&gt;-->
<!--&lt;!&ndash;        </el-form-item>&ndash;&gt;-->
<!--        <el-form-item label="采集时间" prop="time">-->
<!--          <el-date-picker clearable-->
<!--            v-model="form.time"-->
<!--            type="date"-->
<!--            value-format="yyyy-MM-dd"-->
<!--            placeholder="请选择采集时间">-->
<!--          </el-date-picker>-->
<!--        </el-form-item>-->
<!--        <el-form-item label="数据类型" prop="dateCategory">-->
<!--          <el-input v-model="form.dateCategory" placeholder="请输入数据类型" />-->
<!--        </el-form-item>-->
<!--        <el-form-item label="值" prop="value">-->
<!--          <el-input v-model="form.value" placeholder="请输入值" />-->
<!--        </el-form-item>-->
<!--        <el-form-item label="数值类型" prop="valueCategory">-->
<!--&lt;!&ndash;          <el-input v-model="form.valueCategory" placeholder="请输入数值类型" />&ndash;&gt;-->
<!--          <el-select v-model="form.valueCategory" placeholder="请选择数值类型">-->
<!--          <el-option-->
<!--            v-for="item in valueCategoryoptions"-->
<!--            :key="item.id"-->
<!--            :label="item.valueCategoryName"-->
<!--            :value="item.id">-->
<!--          </el-option>-->
<!--          </el-select>-->
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
<!--  </div>-->
<!--</template>-->

<!--<script>-->
<!--import { listStatistics, getStatistics, delStatistics, addStatistics, updateStatistics } from "@/api/date/statistics";-->
<!--import * as echarts from 'echarts';-->
<!--export default {-->
<!--  name: "Statistics",-->
<!--  data() {-->
<!--    return {-->
<!--      valueCategoryoptions:[{-->
<!--        id: 1,-->
<!--        valueCategoryName: "平均值"}, {-->
<!--        id: 2,-->
<!--        valueCategoryName: "最大值"}, {-->
<!--        id: 3,-->
<!--        valueCategoryName: "最小值"}, {-->
<!--        id: 4,-->
<!--        valueCategoryName: "中位数"}, {-->
<!--        id: 5,-->
<!--        valueCategoryName: "方差"},],-->
<!--      // 遮罩层-->
<!--      loading: true,-->
<!--      // 选中数组-->
<!--      ids: [],-->
<!--      // 非单个禁用-->
<!--      single: true,-->
<!--      // 非多个禁用-->
<!--      multiple: true,-->
<!--      // 显示搜索条件-->
<!--      showSearch: true,-->
<!--      // 总条数-->
<!--      total: 0,-->
<!--      // 最新平均值表格数据-->
<!--      statisticsList: [],-->
<!--      // 弹出层标题-->
<!--      title: "",-->
<!--      // 是否显示弹出层-->
<!--      open: false,-->
<!--      // 查询参数-->
<!--      queryParams: {-->
<!--        pageNum: 1,-->
<!--        pageSize: 10,-->
<!--        time: null,-->
<!--        dateCategory: null,-->
<!--        value: null,-->
<!--        valueCategory: null,-->
<!--      },-->
<!--      // 表单参数-->
<!--      form: {},-->
<!--      // 表单校验-->
<!--      rules: {-->
<!--      }-->
<!--    };-->
<!--  },-->
<!--  created() {-->
<!--    this.getList();-->
<!--  },-->
<!--  methods: {-->
<!--    /** 数值类型名称查询 */-->
<!--    getValueCategoryName(valueCategory) {-->
<!--      for (let i = 0; i < this.valueCategoryoptions.length; i++) {-->
<!--        if (this.valueCategoryoptions[i].id === valueCategory) {-->
<!--          return this.valueCategoryoptions[i].valueCategoryName;-->
<!--        }-->
<!--      }-->
<!--    },-->
<!--    /** 查询最新平均值列表 */-->
<!--    getList() {-->
<!--      this.loading = true;-->
<!--      listStatistics(this.queryParams).then(response => {-->
<!--        this.statisticsList = response.rows;-->
<!--        this.statisticsList.forEach(item => {-->
<!--          item.valueCategory = this.getValueCategoryName(item.valueCategory);-->
<!--        });-->
<!--        this.total = response.total;-->
<!--        this.loading = false;-->
<!--      });-->
<!--    },-->
<!--    // 取消按钮-->
<!--    cancel() {-->
<!--      this.open = false;-->
<!--      this.reset();-->
<!--    },-->
<!--    // 表单重置-->
<!--    reset() {-->
<!--      this.form = {-->
<!--        id: null,-->
<!--        time: null,-->
<!--        dateCategory: null,-->
<!--        value: null,-->
<!--        valueCategory: null,-->
<!--        createTime: null,-->
<!--        updateTime: null,-->
<!--        createBy: null,-->
<!--        updateBy: null,-->
<!--        remark: null-->
<!--      };-->
<!--      this.resetForm("form");-->
<!--    },-->
<!--    /** 搜索按钮操作 */-->
<!--    handleQuery() {-->
<!--      this.queryParams.pageNum = 1;-->
<!--      this.getList();-->
<!--    },-->
<!--    /** 重置按钮操作 */-->
<!--    resetQuery() {-->
<!--      this.resetForm("queryForm");-->
<!--      this.handleQuery();-->
<!--    },-->
<!--    // 多选框选中数据-->
<!--    handleSelectionChange(selection) {-->
<!--      this.ids = selection.map(item => item.id)-->
<!--      this.single = selection.length!==1-->
<!--      this.multiple = !selection.length-->
<!--    },-->
<!--    /** 新增按钮操作 */-->
<!--    handleAdd() {-->
<!--      this.reset();-->
<!--      this.open = true;-->
<!--      this.title = "添加最新平均值";-->
<!--    },-->
<!--    /** 修改按钮操作 */-->
<!--    handleUpdate(row) {-->
<!--      this.reset();-->
<!--      const id = row.id || this.ids-->
<!--      getStatistics(id).then(response => {-->
<!--        this.form = response.data;-->
<!--        this.open = true;-->
<!--        this.title = "修改最新平均值";-->
<!--      });-->
<!--    },-->
<!--    /** 提交按钮 */-->
<!--    submitForm() {-->
<!--      this.$refs["form"].validate(valid => {-->
<!--        if (valid) {-->
<!--          if (this.form.id != null) {-->
<!--            updateStatistics(this.form).then(response => {-->
<!--              this.$modal.msgSuccess("修改成功");-->
<!--              this.open = false;-->
<!--              this.getList();-->
<!--            });-->
<!--          } else {-->
<!--            addStatistics(this.form).then(response => {-->
<!--              this.$modal.msgSuccess("新增成功");-->
<!--              this.open = false;-->
<!--              this.getList();-->
<!--            });-->
<!--          }-->
<!--        }-->
<!--      });-->
<!--    },-->
<!--    /** 删除按钮操作 */-->
<!--    handleDelete(row) {-->
<!--      const ids = row.id || this.ids;-->
<!--      this.$modal.confirm('是否确认删除最新平均值编号为"' + ids + '"的数据项？').then(function() {-->
<!--        return delStatistics(ids);-->
<!--      }).then(() => {-->
<!--        this.getList();-->
<!--        this.$modal.msgSuccess("删除成功");-->
<!--      }).catch(() => {});-->
<!--    },-->
<!--    /** 导出按钮操作 */-->
<!--    handleExport() {-->
<!--      this.download('date/statistics/export', {-->
<!--        ...this.queryParams-->
<!--      }, `statistics_${new Date().getTime()}.xlsx`)-->
<!--    },-->
<!--  }-->
<!--};-->


<!--</script>-->
