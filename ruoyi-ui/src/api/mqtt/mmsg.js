import request from '@/utils/request'

// 查询mqtt消息测试列表
export function listMmsg(query) {
  return request({
    url: '/mqtt/mmsg/list',
    method: 'get',
    params: query
  })
}

// 查询mqtt消息测试详细
export function getMmsg(id) {
  return request({
    url: '/mqtt/mmsg/' + id,
    method: 'get'
  })
}


// 新增mqtt消息测试
export function addMmsg(data) {
  return request({
    url: '/mqtt/mmsg',
    method: 'post',
    data: data
  })
}

// 修改mqtt消息测试
export function updateMmsg(data) {
  return request({
    url: '/mqtt/mmsg',
    method: 'put',
    data: data
  })
}

// 删除mqtt消息测试
export function delMmsg(id) {
  return request({
    url: '/mqtt/mmsg/' + id,
    method: 'delete'
  })
}
