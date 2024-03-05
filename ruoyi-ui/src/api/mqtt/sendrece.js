import request from '@/utils/request'

// 查询mqtt接收测试列表
export function sendmqttmsg(data) {
  return request({
    url: '/mqtt/srmsg//mqttsend',
    method: 'post',
    data: data
  })
}

// 查询mqtt接收测试详细
export function getmqttmsg() {
  return request({
    url: '/mqtt/srmsg/mqttrece',
    method: 'post',
  })
}

// 新增mqtt接收测试
export function addRmsg(data) {
  return request({
    url: '/mqtt/rmsg',
    method: 'post',
    data: data
  })
}
