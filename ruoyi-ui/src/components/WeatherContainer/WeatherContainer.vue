<template>
  <div id="WeatherContainer">
    <div>天气：{{weather}}</div>
    <div>温度：{{temperature}}</div>
    <div>风向：{{winddirection}}</div>
    <div>风力：{{windpower}}</div>
    <div>湿度：{{humidity}}</div>
    <div>更新时间：{{reporttime}}</div>
  </div>
</template>
<script>
import axios from 'axios'

export default {
  data() {
    return {
      province: "",
      city: "",
      adcode: "",
      weather: "",
      temperature: "",
      winddirection: "",
      windpower: "",
      humidity: "",
      reporttime: "",
    }
  },
  methods: {
    getWeatherData() {
      const apiUrl = `https://restapi.amap.com/v3/weather/weatherInfo?city=610403&key=1519263621cbd97d06b689c56cb430af`;

      axios.get(apiUrl)
        .then(response => {
          // 处理返回的天气数据
          const weatherData = response.data.lives[0];
          this.province = weatherData.province;
          this.city = weatherData.city;
          this.adcode = weatherData.adcode;
          this.weather = weatherData.weather;
          this.temperature = weatherData.temperature;
          this.winddirection = weatherData.winddirection;
          this.windpower = weatherData.windpower;
          this.humidity = weatherData.humidity;
          this.reporttime = weatherData.reporttime;
        })
        .catch(error => {
          console.error(error);
        });
    },
  },
  mounted() {
    //DOM初始化完成进行天气初始化
    this.getWeatherData()
  }
}
</script>
<style>
    #MapContainer {
    padding: 0px;
    margin: 0px;
    width: 100%;
    height: 100%;
  }
</style>
