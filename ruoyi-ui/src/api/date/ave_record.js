import request from '@/utils/request'

// 查询所有平均值列表
export function listAve_ALL() {
  return request({
    url: '/date/ave_record/listALL',
    method: 'get',
  })
}

// 查询平均值列表
export function listAve_record(query) {
  return request({
    url: '/date/ave_record/list',
    method: 'get',
    params: query
  })
}

// 查询平均值详细
export function getAve_record(cType) {
  return request({
    url: '/date/ave_record/' + cType,
    method: 'get'
  })
}

// 新增平均值
export function addAve_record(data) {
  return request({
    url: '/date/ave_record',
    method: 'post',
    data: data
  })
}

// 修改平均值
export function updateAve_record(data) {
  return request({
    url: '/date/ave_record',
    method: 'put',
    data: data
  })
}

// 删除平均值
export function delAve_record(cType) {
  return request({
    url: '/date/ave_record/' + cType,
    method: 'delete'
  })
}
