<template>
  <div id="MapContainer"></div>
</template>

<script>
import AMapLoader from '@amap/amap-jsapi-loader'
window._AMapSecurityConfig = {
  securityJsCode: 'c5366db0ebf9ba1c4ab436223d80c15b'
}
export default {
  data() {
    return {
      map: null
    }
  },
  methods: {
    initMap() {
      AMapLoader.load({
        key: '7cedb88762688655c6d9e3ea53fc029d', // 申请好的Web端开发者Key，首次调用 load 时必填
        version: '2.0', // 指定要加载的 JSAPI 的版本，缺省时默认为 1.4.15
        plugins: ["AMap.Scale","AMap.ToolBar","AMap.ControlBar","AMap.MouseTool","AMap.MapType","AMap.HawkEye"] // 需要使用的的插件列表，如比例尺'AMap.Scale'等
      })
        .then(AMap => {
          this.map = new AMap.Map('MapContainer', {
            //设置地图容器id
            viewMode: '2D', //是否为3D地图模式
            zoom: 16.8, //初始化地图级别
            center: [108.07479480581283, 34.29114565289615] //初始化地图中心点位置
          })

        })
        .catch(e => {
          console.log(e)
        })
    }
  },
  mounted() {
    //DOM初始化完成进行地图初始化
    this.initMap()
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

