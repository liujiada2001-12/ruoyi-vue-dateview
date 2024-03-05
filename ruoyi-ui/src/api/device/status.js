import request from '@/utils/request'


// 查询所有设备状态列表
export function listALLStatus() {
  return request({
    url: '/device/status/listALLStatus',
    method: 'get'
  })
}
// 查询设备状态列表
export function listStatus(query) {
  return request({
    url: '/device/status/list',
    method: 'get',
    params: query
  })
}

// 查询设备状态详细
export function getStatus(id) {
  return request({
    url: '/device/status/' + id,
    method: 'get'
  })
}

// 新增设备状态
export function addStatus(data) {
  return request({
    url: '/device/status',
    method: 'post',
    data: data
  })
}

// 修改设备状态
export function updateStatus(data) {
  return request({
    url: '/device/status',
    method: 'put',
    data: data
  })
}

// 删除设备状态
export function delStatus(id) {
  return request({
    url: '/device/status/' + id,
    method: 'delete'
  })
}
