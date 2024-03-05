import request from '@/utils/request'

// 查询设备信息列表
export function listMsg(query) {
  return request({
    url: '/device/msg/list',
    method: 'get',
    params: query
  })
}

// 查询设备信息详细
export function getMsg(id) {
  return request({
    url: '/device/msg/' + id,
    method: 'get'
  })
}

// 新增设备信息
export function addMsg(data) {
  return request({
    url: '/device/msg',
    method: 'post',
    data: data
  })
}

// 修改设备信息
export function updateMsg(data) {
  return request({
    url: '/device/msg',
    method: 'put',
    data: data
  })
}

// 删除设备信息
export function delMsg(id) {
  return request({
    url: '/device/msg/' + id,
    method: 'delete'
  })
}
