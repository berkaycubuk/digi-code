import { get, post, del } from "$lib/api";

const getAll = () => {
	return get('/api/v1/product/all')
}

const getRelated = (id) => {
	return get('/api/v1/product-comment/product/' + id)
}

const create = (body) => {
	return post('/api/v1/product-comment/create', body)
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
	getRelated,
}
