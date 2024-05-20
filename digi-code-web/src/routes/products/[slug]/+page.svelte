<script>
	import Header from "$lib/components/Header.svelte";
	import Footer from "$lib/components/Footer.svelte";
	import ProductInfo from '$lib/components/ProductInfo.svelte';
	import ProductSlider from "$lib/components/ProductSlider.svelte";
	import ProductDetails from "$lib/components/ProductDetails.svelte";
	import ProductDescription from "../../../lib/components/ProductDescription.svelte";
	import ProductReviews from "../../../lib/components/ProductReviews.svelte";
	import SimiliarProducts from "../../../lib/components/SimiliarProducts.svelte";
</script>

<Header addSpace={true} />

<main class="grow">

	<section class="container mx-auto px-6 grid grid-cols-2 gap-10 py-10">

		<ProductSlider />

		<ProductInfo />

	</section>

	<section class="container mx-auto px-6 py-10">

		<ProductDescription />

		<ProductDetails />

		<ProductReviews />

	</section>

	<SimiliarProducts />

</main>

<Footer />
