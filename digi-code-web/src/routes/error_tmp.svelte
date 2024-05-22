<script>
	import Header from "$lib/components/Header.svelte";
	import Footer from "$lib/components/Footer.svelte";
</script>

<Header glassOnScroll={false} addSpace={true} />

<main class="grow">

	<div class="container mx-auto px-6 py-10">

		<h1 class="text-4xl font-semibold text-center mb-8">404 Not Found.</h1>

		<a class="block w-fit mx-auto text-blue-600" href="/">Go back</a>

	</div>

</main>

<Footer />
