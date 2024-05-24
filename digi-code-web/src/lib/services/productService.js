import { get, post, del } from "$lib/api";

const getAll = () => {
	return get('/api/v1/product/all')
}

const create = (body) => {
	return post('/api/v1/product/create', body)
}

const deleteOne = (id) => {
	return del('/api/v1/product/' + id)
}

const getOne = (id) => {
	return get('/api/v1/product/' + id)
}

export default {
	getAll,
	create,
	deleteOne,
	getOne,
}
