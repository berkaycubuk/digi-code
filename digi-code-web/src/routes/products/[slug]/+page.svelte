<script>
	import Header from "$lib/components/Header.svelte";
	import Footer from "$lib/components/Footer.svelte";
	import ProductInfo from '$lib/components/ProductInfo.svelte';
	import ProductSlider from "$lib/components/ProductSlider.svelte";
	import ProductDetails from "$lib/components/ProductDetails.svelte";
	import ProductDescription from "../../../lib/components/ProductDescription.svelte";
	import ProductReviews from "../../../lib/components/ProductReviews.svelte";
	import SimiliarProducts from "../../../lib/components/SimiliarProducts.svelte";
	import { onMount } from "svelte";
	import { page } from "$app/stores";
	import productService from "$lib/services/productService";

	let product = null

	const fetchProduct = async () => {
		try {
			const response = await productService.getOne($page.params.slug)
			console.log(response)
			product = response
		} catch(err) {
			console.log(err)
		}
	}

	onMount(() => {
		fetchProduct()
	})
</script>

<Header addSpace={true} />

<main class="grow">

	{#if product != null}

	<div class="container mx-auto px-6 pt-8">

		<a href="/products">Go back</a>

	</div>

	<section class="container mx-auto px-6 grid grid-cols-2 gap-10 py-10">

		<ProductSlider />

		<ProductInfo title={product.title} price={product.price} rating={product.rating} />

	</section>

	<section class="container mx-auto px-6 py-10">

		<ProductDescription />

		<ProductDetails />

		<ProductReviews comments={product.productComments} />

	</section>

	<SimiliarProducts />

	{/if}

</main>

<Footer />
