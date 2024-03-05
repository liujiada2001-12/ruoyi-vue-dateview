import request from '@/utils/request'

// 查询最新平均值列表
export function listStatistics(query) {
  return request({
    url: '/date/statistics/list',
    method: 'get',
    params: query
  })
}

// 查询最新平均值详细
export function getStatistics(id) {
  return request({
    url: '/date/statistics/' + id,
    method: 'get'
  })
}

// 新增最新平均值
export function addStatistics(data) {
  return request({
    url: '/date/statistics',
    method: 'post',
    data: data
  })
}

// 修改最新平均值
export function updateStatistics(data) {
  return request({
    url: '/date/statistics',
    method: 'put',
    data: data
  })
}

// 删除最新平均值
export function delStatistics(id) {
  return request({
    url: '/date/statistics/' + id,
    method: 'delete'
  })
}
