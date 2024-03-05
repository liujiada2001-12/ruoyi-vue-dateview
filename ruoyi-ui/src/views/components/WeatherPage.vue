<template>
  <div class="WeatherPage">
    <div>
      1111233331
<!--      {{city}}-->
    </div>
  </div>
</template>

<script>
import axios from 'axios'
// 允许跨域携带cookie
axios.defaults.withCredentials = true;
export default {
  data() {
    return {
      city: "",
      // obj: [],
      // date: "",
      // week: "",
      // message: ""
    };
  },
  mounted() {
    this.get(); //页面开始加载时调用get方法
    var that = this;
    axios.get(
      'https://restapi.amap.com/v3/weather/weatherInfo?parameters', {
        params:{
          key:'1519263621cbd97d06b689c56cb430af',
          city:'610403',
          extensions:'base',
          output:'JSON'
        }
      }
    ).then
    (function(response) {
        //处理数据
        that.city = response.data.data.lives.city;
      })
  },
  methods: {

  }
}
</script>

<style>
.WeatherPage {
  /* 高度410px */
  height: 10.125rem;
  border: 1px solid blue;
  /* 外边距20px */
  margin: 0.25rem;
  //background-color: rgba(13, 130, 255, 0.851);
}
</style>
