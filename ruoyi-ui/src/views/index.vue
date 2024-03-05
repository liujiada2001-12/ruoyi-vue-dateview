<template>
  <div class="wrap">
    <!--    头部div-->
    <div class="header">
      <div class="h2"></div>
      <div class="h1">大屏可视化平台</div>
      <div class="h2"></div>
    </div>
    <div class="header2">
      {{ nowTime }}
    </div>
    <!--    下部容器div-->
    <div class="container">
      <!--左边模块-->
      <div class="leftpart">
        <!--左边上模块-->
        <div class="lefttopback">
          <RadarContainer id="Radarchart1"></RadarContainer>
        </div>
        <!--左边模块分割-->
        <div style="width:100%;height:0.5%;"></div>
        <!--左边下模块-->
        <div class="leftbottomback">
          <BarContainer/>
        </div>
      </div>

      <!--中间模块-->
      <div class="centerpart">
        <div class="centertopback">

        </div>
        <div class="centerbottomback">
          <LineContainer id="Linechart1"></LineContainer>
        </div>
      </div>

      <!--右边模块-->
      <div class="rtghtpart">
        <!--右边第一个模块--天气-->
        <div class="righttopback">
          <WeatherContainer/>
        </div>
        <!--右边模块分割-->
        <div style="width:100%;height:0.4%;"></div>
        <!--右边第二个模块-->
        <div class="rightcenterback">
          <MapContainer/>
        </div>
        <!--右边模块分割-->
        <div style="width:100%;height:0.1%;"></div>
        <!--右边第二个模块-->
        <div class="rightbottomback"></div>
      </div>

    </div>
  </div>

</template>
<script>
import WeatherContainer from "@/components/WeatherContainer/WeatherContainer";
import MapContainer from "@/components/MapContainer/MapContainer";
import BigMapContainer from "@/components/MapContainer/BigMapContainer";
import BarContainer from "@/components/BarContainer/BarContainer";
import LineContainer from "@/components/LineContainer/LineContainer";
import RadarContainer from "@/components/RadarContainer/RadarContainer";
export default {
  components: {
    WeatherContainer,
    MapContainer,
    BigMapContainer,
    BarContainer,
    RadarContainer,
    LineContainer,
  },
  data() {
    return {
      nowTime: '',
      optionZhe:{ //折线图的配置
        title:{
          text:"折线图",
          left:'center'
        },
        xAxis:{
          type: 'category',
          data: ['Mon','Tue','Wed','Thu','Fri','Sat','Sun']
        },
        yAxis:{
          type: 'value'
        },
        series: [
          {
            data:[5, 20, 36, 10, 10, 20],
            type:'line'
          }
        ]
      },
    };
  },
  mounted() {
    this.getNowTime();

  },
  methods: {
    getNowTime () {
      let speed = 1000
      let that = this
      let theNowTime = function () {
        that.nowTime = that.timeNumber()
      }
      setInterval(theNowTime, speed)
    },
    timeNumber () {
      let today = new Date()
      let date = today.getFullYear() + '-' + this.twoDigits(today.getMonth() + 1) + '-' + this.twoDigits(today.getDate())
      let time = this.twoDigits(today.getHours()) + ':' + this.twoDigits(today.getMinutes()) + ':' + this.twoDigits(today.getSeconds())
      return date + '  ' + time
    },
    twoDigits (val) {
      if (val < 10) return '0' + val
      return val
    },
  },
}
</script>

<style scoped>
.wrap {
  background: url("~@/assets/images/background.jpg");
  background-size: cover;
  width: 100%;
  height: 60vw;
  border: 2px dashed #aaa;
}
.header {
  display: flex;
  justify-content: space-between;
  font-size: 1vw;
  height: 6%;
  color: #ffffff;
  text-align: center;
  line-height:4vw;
  border: 2px dashed #aaa;
  background: url("~@/assets/images/h1.jpg");
  background-size: cover;
}
.header2 {
  font-size: 1vw;
  height: 2%;
  color: #ffffff;
  text-align: right;
  line-height:1vw;
  border: 2px dashed #aaa;
}
.h1{
  float:left;
  width:60%;
  font-size: 1vw;
  height: 8%;
  color: #ffffff;
  text-align: center;
  line-height:4vw;
  border: 2px dashed #aaa;
}
.h2{
  float:left;
  font-size: 1vw;
  color: #ffffff;
  text-align: right;
  line-height:4vw;
  border: 2px dashed #aaa;
}
.container {
  margin: 0 0.5vw 0.5vw;
  display: flex;
  justify-content: space-between;
  height: 92%;
  border: 2px dashed #aaa;
}
.leftpart{
  float:left;
  width:18%;
  height:98%;
  border: 2px dashed #aaa;
}
.centerpart{
  float:left;
  width:62%;
  height:98%;
  border: 2px dashed #aaa;
}
.rtghtpart{
  float:left;
  width:20%;
  height:98%;
  border: 2px dashed #aaa;
}
.lefttopback {
  width:100%;
  height:35%;
  background-color: rgba(46, 66, 96, 0.4);
  border: 2px dashed #aaa;
}
.leftbottomback {
  width:100%;
  height:65%;
  background-color: rgba(46, 66, 96, 0.4);
  border: 2px dashed #aaa;
}
.centertopback {
  width:100%;
  height:65%;
  background-color: rgba(46, 66, 96, 0.4);
  border: 2px dashed #aaa;
}
.centerbottomback {
  width:100%;
  height:35%;
  background-color: rgba(46, 66, 96, 0.4);
  border: 2px dashed #aaa;
}
.righttopback {
  width:100%;
  height:40%;
  background-color: rgba(46, 66, 96, 0.4);
  border: 2px dashed #aaa;
}
.rightbottomback {
  width:100%;
  height:30%;
  background-color: rgba(46, 66, 96, 0.4);
  border: 2px dashed #aaa;
}
.rightcenterback {
  width:100%;
  height:30%;
  background-color: rgba(46, 66, 96, 0.4);
  border: 2px dashed #aaa;
}
</style>
