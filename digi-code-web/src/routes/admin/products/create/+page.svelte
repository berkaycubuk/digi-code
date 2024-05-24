<script>
	import { goto } from "$app/navigation"
	import productService from "$lib/services/productService";

	let title;
	let description;
	let price;
	let rating;

	const save = async () => {
		try {
			const response = await productService.create({
				title,
				description,
				price,
				rating
			})

			console.log(response)

			goto("/admin/products")
		} catch(err) {
			console.log(err)
		}
	}

</script>

<div class="p-6">
	<form class="grid grid-cols-2 gap-2">

		<div class="flex flex-col gap-1">
			<label for="title">Title</label>
			<input id="title" type="text" class="input" bind:value={title} />
		</div>

		<div class="flex flex-col gap-1">
			<label for="description">Description</label>
			<textarea id="description" class="input" bind:value={description}></textarea>
		</div>

		<div class="flex flex-col gap-1">
			<label for="price">Price</label>
			<input id="price" type="text" class="input" bind:value={price} />
		</div>

		<div class="flex flex-col gap-1">
			<label for="rating">Rating</label>
			<input id="rating" type="text" class="input" bind:value={rating} />
		</div>

		<div class="col-span-2">
			<button class="button" on:click={save}>Save</button>
		</div>

	</form>
</div>
