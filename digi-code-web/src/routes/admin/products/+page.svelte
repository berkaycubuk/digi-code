<script>
	import productService from "$lib/services/productService";
	import { onMount } from "svelte";

	let products = [];

	const fetchProducts = async () => {
		try {
			const response = await productService.getAll()
			products = response
			console.log(response)
		} catch(err) {
			console.log(err)
		}
	}

	const deleteProduct = async (id) => {
		if (!confirm("Are you sure?")) {
			return;
		}

		try {
			const response = await productService.deleteOne(id)
			console.log(response)

			fetchProducts()
		} catch(err) {
			console.log(err)
		}
	}

	onMount(() => {
		fetchProducts()
	})
</script>

<div class="p-6">

	<a href="/admin/products/create">Create new product</a>

	<table class="w-full">
		<tr>
			<th class="text-left p-2">ID</th>
			<th class="text-left p-2">Title</th>
			<th class="text-left p-2">Price</th>
			<th class="text-left p-2">Rating</th>
			<th></th>
		</tr>
		{#each products as product}
		<tr>
			<td class="p-2">{product.id}</td>
			<td class="p-2">{product.title}</td>
			<td class="p-2">{product.price}</td>
			<td class="p-2">{product.rating}</td>
			<td>
				<button class="button button--danger" on:click={() => deleteProduct(product.id)}>Delete</button>
			</td>
		</tr>
		{/each}
	</table>

</div>
