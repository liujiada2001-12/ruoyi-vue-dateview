import request from '@/utils/request'

// 查询所有设备分类列表
export function listALLCategory() {
  return request({
    url: '/device/category/listALLCategory',
    method: 'get'
  })
}
// 查询设备单页分类列表
export function listCategory(query) {
  return request({
    url: '/device/category/list',
    method: 'get',
    params: query
  })
}

// 查询设备分类详细
export function getCategory(id) {
  return request({
    url: '/device/category/' + id,
    method: 'get'
  })
}

// 新增设备分类
export function addCategory(data) {
  return request({
    url: '/device/category',
    method: 'post',
    data: data
  })
}

// 修改设备分类
export function updateCategory(data) {
  return request({
    url: '/device/category',
    method: 'put',
    data: data
  })
}

// 删除设备分类
export function delCategory(id) {
  return request({
    url: '/device/category/' + id,
    method: 'delete'
  })
}
