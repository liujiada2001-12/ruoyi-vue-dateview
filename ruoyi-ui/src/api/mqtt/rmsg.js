import request from '@/utils/request'

// 查询mqtt接收测试列表
export function listRmsg(query) {
  return request({
    url: '/mqtt/rmsg/list',
    method: 'get',
    params: query
  })
}

// 查询mqtt接收测试详细
export function getRmsg(id) {
  return request({
    url: '/mqtt/rmsg/' + id,
    method: 'get'
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

// 修改mqtt接收测试
export function updateRmsg(data) {
  return request({
    url: '/mqtt/rmsg',
    method: 'put',
    data: data
  })
}

// 删除mqtt接收测试
export function delRmsg(id) {
  return request({
    url: '/mqtt/rmsg/' + id,
    method: 'delete'
  })
}
