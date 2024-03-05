import request from '@/utils/request'

// 查询数据分类列表
export function listCategory(query) {
  return request({
    url: '/date/category/list',
    method: 'get',
    params: query
  })
}

// 查询数据分类详细
export function getCategory(id) {
  return request({
    url: '/date/category/' + id,
    method: 'get'
  })
}

// 新增数据分类
export function addCategory(data) {
  return request({
    url: '/date/category',
    method: 'post',
    data: data
  })
}

// 修改数据分类
export function updateCategory(data) {
  return request({
    url: '/date/category',
    method: 'put',
    data: data
  })
}

// 删除数据分类
export function delCategory(id) {
  return request({
    url: '/date/category/' + id,
    method: 'delete'
  })
}
