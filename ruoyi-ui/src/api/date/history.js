import request from '@/utils/request'

// 查询所有历史数据列表
export function listALLHistory() {
  return request({
    url: '/date/history/listALL',
    method: 'get',
  })
}

// 查询历史数据列表
export function listHistory(query) {
  return request({
    url: '/date/history/list',
    method: 'get',
    params: query
  })
}

// 查询历史数据详细
export function getHistory(time) {
  return request({
    url: '/date/history/' + time,
    method: 'get'
  })
}

// 新增历史数据
export function addHistory(data) {
  return request({
    url: '/date/history',
    method: 'post',
    data: data
  })
}

// 修改历史数据
export function updateHistory(data) {
  return request({
    url: '/date/history',
    method: 'put',
    data: data
  })
}

// 删除历史数据
export function delHistory(time) {
  return request({
    url: '/date/history/' + time,
    method: 'delete'
  })
}
