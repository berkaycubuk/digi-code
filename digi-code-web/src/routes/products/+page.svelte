<script>
	import Header from "$lib/components/Header.svelte";
	import Footer from "$lib/components/Footer.svelte";
	import FilterSidebar from "../../lib/components/FilterSidebar.svelte";
	import ProductCard from "../../lib/components/ProductCard.svelte";

	import { onMount } from "svelte";
	import productService from "$lib/services/productService";

	let products = [];

	const fetchAllProducts = async () => {
		try {
			const response = await productService.getAll()

			products = response
			console.log(products)
		} catch(err) {
			console.log(err)
		}
	}

	onMount(() => {
		fetchAllProducts()
	})
</script>

<Header glassOnScroll={false} addSpace={true} />

<main class="grow">

	<div class="container mx-auto px-6 py-10 flex gap-8">


		<div class="w-[250px]">

			<FilterSidebar />

		</div>

		<div class="grow">

			{#if products.length > 0}
			<h1 class="text-2xl font-medium mb-2">Results</h1>
			<p class="font-light text-neutral-600">Found {products.length} products.</p>
			{/if}

			<div class="grid grid-cols-4 gap-6 mt-10">

				{#each products as product}
				<a href="/products/{product.id}">
					<ProductCard title={product.title} image="https://images.unsplash.com/photo-1596552183299-000ef779e88d?q=80&w=1964&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D" price={product.price} stars={product.rating}/>
				</a>
				{/each}

			</div>

		</div>


	</div>

</main>

<Footer />
