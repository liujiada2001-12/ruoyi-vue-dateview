import request from '@/utils/request'

// 查询数据汇总列表
export function listMsg(query) {
  return request({
    url: '/date/msg/list',
    method: 'get',
    params: query
  })
}

// 查询数据汇总详细
export function getMsg(id) {
  return request({
    url: '/date/msg/' + id,
    method: 'get'
  })
}

// 新增数据汇总
export function addMsg(data) {
  return request({
    url: '/date/msg',
    method: 'post',
    data: data
  })
}

// 修改数据汇总
export function updateMsg(data) {
  return request({
    url: '/date/msg',
    method: 'put',
    data: data
  })
}

// 删除数据汇总
export function delMsg(id) {
  return request({
    url: '/date/msg/' + id,
    method: 'delete'
  })
}
