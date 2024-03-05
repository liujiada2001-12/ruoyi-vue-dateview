<template>
  <div>
    <div id="BarContainer" >
      <el-row :gutter="10">
        <el-col :span="12">
          <el-tag>{{ name1 }}</el-tag>
          <el-progress type="circle"
                       :percentage="percentage1.toFixed(1)"
                       :color="customColorMethod"
                       text-color="white"
                       :width="100"></el-progress>
        </el-col>
        <el-col :span="12">
          <el-tag>{{ name2 }}</el-tag>
          <el-progress type="circle"
                       :percentage="percentage2.toFixed(1)"
                       :color="customColorMethod"
                       text-color	='white'
                       :width="100"></el-progress>
        </el-col>
      </el-row>
      <el-row :gutter="10">
        <el-col :span="12">
          <el-tag>{{ name3 }}</el-tag>
          <el-progress type="circle"
                       :percentage="percentage3.toFixed(1)"
                       :color="customColorMethod"
                       text-color="white"
                       :width="100"></el-progress>
        </el-col>
        <el-col :span="12">
          <el-tag>{{ name4 }}</el-tag>
          <el-progress type="circle"
                       :percentage="percentage4.toFixed(1)"
                       :color="customColorMethod"
                       text-color	='white'
                       :width="100"></el-progress>
        </el-col>
      </el-row>
      <el-row :gutter="10">
        <el-col :span="12">
          <el-tag>{{ name5 }}</el-tag>
          <el-progress type="circle"
                       :percentage="percentage5.toFixed(1)"
                       :color="customColorMethod"
                       text-color="white"
                       :width="100"></el-progress>
        </el-col>
        <el-col :span="12">
          <el-tag>{{ name6 }}</el-tag>
          <el-progress type="circle"
                       :percentage="percentage6.toFixed(1)"
                       :color="customColorMethod"
                       text-color	='white'
                       :width="100"></el-progress>
        </el-col>
      </el-row>
      <el-row :gutter="10">
        <el-col :span="12">
          <el-tag>{{ name7 }}</el-tag>
          <el-progress type="circle"
                       :percentage="percentage7.toFixed(1)"
                       :color="customColorMethod"
                       text-color="white"
                       :width="100"></el-progress>
        </el-col>
        <el-col :span="12">
          <el-tag>{{ name8 }}</el-tag>
          <el-progress type="circle"
                       :percentage="percentage8.toFixed(1)"
                       :color="customColorMethod"
                       text-color	='white'
                       :width="100"></el-progress>
        </el-col>
      </el-row>
    </div>
  </div>
</template>

<script>
import { listAve_record, getAve_record, delAve_record, addAve_record, updateAve_record } from "@/api/date/ave_record";
export default {
  name: 'Radar',
  data() {
    return {
      name1: '0',
      name2: '0',
      name3: '0',
      name4: '0',
      name5: '0',
      name6: '0',
      name7: '0',
      name8: '0',
      percentage1:0,
      percentage2:0,
      percentage3:0,
      percentage4:0,
      percentage5:0,
      percentage6:0,
      percentage7:0,
      percentage8:0,
      customColor: '#409eff',
      queryParams1: {
        pageNum: 1,
        pageSize: 100,
        cType: null,
        cValue: null,
        vType: "real"
      },
      // 平均值表格数据
      realList: [],
      realvaule: [],
      // 表单参数
      form: {},
    }
  },
  mounted() {
    this.getrealvaule();
    // this.drawLine();
  },
  methods: {
    //方法
    format(percentage) {
      return "1\n"+percentage +'%'
    },

    customColorMethod(percentage) {
      if (percentage < 30) {
        return '#909399';
      } else if (percentage < 60) {
        return '#e6a23c';
      } else {
        return '#67c23a';
      }
    },
    /** 查询平均值列表 */
    getrealList() {
      listAve_record(this.queryParams1).then(response => {
        this.realList = response.rows;
        this.name1 = response.rows[0].cType;
        this.name2 = response.rows[1].cType;
        this.name3 = response.rows[2].cType;
        this.name4 = response.rows[3].cType;
        this.name5 = response.rows[4].cType;
        this.name6 = response.rows[5].cType;
        this.name7 = response.rows[6].cType;
        this.name8 = response.rows[7].cType;
        this.percentage1 = 100*response.rows[0].cValue;
        this.percentage2 = 100*response.rows[1].cValue;
        this.percentage3 = 100*response.rows[2].cValue;
        this.percentage4 = 100*response.rows[3].cValue;
        this.percentage5 = 100*response.rows[4].cValue;
        this.percentage6 = 100*response.rows[5].cValue;
        this.percentage7 = 100*response.rows[6].cValue;
        this.percentage8 = 100*response.rows[7].cValue;
        // console.log(this.realList[0].cValue);
      });
    },
    getrealvaule(){
      this.getrealList();

      // console.log(this.realvaule);
    },
  },
}
</script>

<style>
#BarContainer {
  padding: 0px;
  margin: 0px;
  width: 100%;
  height: 100%;
}
</style>
