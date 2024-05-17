<script>
	import Header from "$lib/components/Header.svelte";
	import Footer from "$lib/components/Footer.svelte";
	import HeroSlider from "$lib/components/HeroSlider.svelte";
	import HeroWelcome from "$lib/components/HeroWelcome.svelte";
	import LandingFeaturedProducts from "$lib/components/LandingFeaturedProducts.svelte";
	import LandingVideo from "../lib/components/LandingVideo.svelte";
</script>

<Header glassOnScroll={true} />

<main class="grow">

	<HeroSlider />

	<HeroWelcome />

	<LandingFeaturedProducts />

	<LandingVideo />

</main>

<Footer />
