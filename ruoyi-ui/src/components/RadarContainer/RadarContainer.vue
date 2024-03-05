<template>
  <div>
    <div id="radarChart" ref="radarChart" ></div>
  </div>
</template>

<script>
import { listAve_ALL,listAve_record, getAve_record, delAve_record, addAve_record, updateAve_record } from "@/api/date/ave_record";
export default {
  name: 'Radar',
  data() {
    return {
      radarchartinstance: null,
      alldate: [],
      // 平均值表格数据
      dateList: {
        name: null,
        realvalue: null,
        lastvalue: null,
        max:null,
      },
      // 表单参数
      form: {},
    }
  },
  mounted() {
    this.initradarchart();
    this.getdateradarchart();
    // this.drawLine();
  },
  methods: {
    initradarchart() {
      // console.log(this.$refs.linechart);
      // console.log(document.getElementById('linechart'))
      this.radarchartinstance = this.$echarts.init(this.$refs.radarChart);
    },
    getdateradarchart(){
      listAve_ALL().then(response => {
        // this.historyList = response.rows;
        this.alldate = response.rows;
        // console.log(this.alldate);
        this.total = response.total;
        this.updateradarchart();
      });
    },
    updateradarchart(){
      this.dateList.realvalue=this.alldate.map((item) => {
        if(item.vType == "real"){
          if(item.cValue !=null){
            return item.cValue
          }
          else{
            return 0
          }
        }
      }).filter(Boolean);
      this.dateList.name=this.alldate.map((item) => {
        if(item.vType == "real"){
          if(item.cType !=null){
            return item.cType
          }
          else{
            return "unknown"
          }
        }
      }).filter(Boolean);
      // console.log(realdatename);
      this.dateList.lastvalue=this.alldate.map((item) => {
        if(item.vType == "last"){
          if(item.cValue !=null){
            return item.cValue
          }
          else{
            return 0
          }
        }
      }).filter(Boolean);
      this.dateList.max=this.alldate.map((item) => {
        if(item.vType == "real"){
          return {name:item.cType,max:1}
        }
      }).filter(Boolean);
      const dataMax = this.dateList.max
      const option = {
        legend:{
          show:true,
          itemWidth: 2,
          right:0,
          textStyle:{
            color: "white",
            fontSize: 10,
          },
        },
        //配置维度的最大值
        radar: {
          name: {
            show: true,
            color: 'white',
          },
          //   雷达图的指示器，用来指定雷达图中的多个变量（维度）
          indicator: dataMax,
          shape: 'circle', //对雷达图形设置成一个圆形,可选 circle:圆形,polygon:多角形(默认)
          radius: '70%',
          center: ['50%', '45%'],
        },
        series: [
          {
            type: 'radar',
            label: {
              show: true, //显示数值
            },
            areaStyle: {}, //每个雷达图形成一个阴影的面积
            data: [
              {
                name: 'last',
                value: this.dateList.lastvalue,
              },
              {
                name: 'real',
                value: this.dateList.realvalue,
              },
            ],
          },
        ],

      }
      this.radarchartinstance.setOption(option,true);
      window.addEventListener('resize', function() {
        myChart.resize();
      });
    },
    drawLine() {
      // 基于准备好的dom，初始化echarts实例
      let myChart = this.$echarts.init(this.$refs.radarChart)
      let dataMax = [
        { name: '1', max: '1' },
        { name: '2', max: '1' },
        { name: '3', max: '1' },
        { name: '4', max: '1' },
        { name: '5', max: '1' },
        { name: '6', max: '1' },
        { name: '7', max: '1' },
        { name: '8', max: '1' },
      ]
      let option = {
        legend:{
          show:true,
          itemWidth: 2,
          right:0,
          textStyle:{
            color: "white",
            fontSize: 10,
          },
        },
        //配置维度的最大值
        radar: {
          name: {
            show: true,
            color: 'white',
          },
          //   雷达图的指示器，用来指定雷达图中的多个变量（维度）
          indicator: dataMax,
          shape: 'circle', //对雷达图形设置成一个圆形,可选 circle:圆形,polygon:多角形(默认)
          radius: '70%',
          center: ['50%', '45%'],
        },
        series: [
          {
            type: 'radar',
            label: {
              show: true, //显示数值
            },
            areaStyle: {}, //每个雷达图形成一个阴影的面积
            data: [
              {
                name: 'last',
                value: [0.8, 0.9, 0.8, 0.9, 0.9, 0.8, 0.88, 0.62],
              },
              {
                name: 'real',
                value: [0.9, 0.8, 0.88, 0.62, 0.98, 0.8, 0.88, 0.62],
              },
            ],
          },
        ],

      }
      // 绘制图表
      myChart.setOption(option)
    },
  },
}
</script>

<style>
#radarChart {
  /* 高度410px */
  height: 18rem;
  /* 外边距20px */
  //margin: 0.25rem;
  //padding: 0px;
  //margin: 0px;
  //width: 100%;

}
</style>
