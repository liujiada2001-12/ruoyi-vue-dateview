<template>
  <div>
    <div id= 'linechart' class="linechart" ref="linechart" ></div>
  </div>
</template>

<script>
import { listALLHistory ,listHistory, getHistory } from "@/api/date/history";
// import {listALLHistory} from "../../api/date/history";
export default {
  data(){
    return {
      linechaetinstance: null,
      alldate: [],
      total: 0,
    }
  },
  mounted() {
    this.initlinechart();
    this.getdatelinechart();
  },
  methods: {
    initlinechart() {
      // console.log(this.$refs.linechart);
      // console.log(document.getElementById('linechart'))
      this.linechaetinstance = this.$echarts.init(document.getElementById('linechart'));
    },
    getdatelinechart(){
      let list=[];
      listALLHistory().then(response => {
        // this.historyList = response.rows;
        this.alldate = response.rows;
        this.total = response.total;
        this.updatelinechart();
      });
    },
    updatelinechart(){
      const linedatex=this.alldate.map((item) => {return item.time});
      const linedatey=this.alldate.map((item) => {return item.value});
      const option={
        title: {
          text: '历史数据',
          textStyle: {
            color: '#fff',
            fontSize: 16,
            fontWeight: 500,
          },
        },
        xAxis: {
          type: 'category',
          data: linedatex,
          axisLabel: {
            color: '#fff',
            fontSize: 12,
          },
        },
        yAxis: {
          type: 'value',
          axisLabel: {
            color: '#fff',
            fontSize: 12,
          },
        },
        series: [{
          data: linedatey,
          type: 'line'
        }]
      }
      this.linechaetinstance.setOption(option,true);
      window.addEventListener('resize', function() {
        myChart.resize();
      });
      // console.log("option");
    },
  },
}
</script>

<style>
#linechart {
  /* 高度410px */
  height: 18rem;
  /* 外边距20px */
  //margin: 0.25rem;
  //padding: 0px;
  //margin: 0px;
  //width: 100%;

}
</style>
