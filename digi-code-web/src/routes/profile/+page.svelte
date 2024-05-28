<script>
	import Header from "$lib/components/Header.svelte";
	import Footer from "$lib/components/Footer.svelte";
</script>

<Header addSpace={true} />

<main class="grow">

	<section class="container m-auto px-6 py-6">

	</section>

	<section class="container mx-auto px-6 py-6">

		<nav class="flex flex-col">

			<a class="p-4 text-xl font-medium bg-neutral-100 text-neutral-800" href="/addresses">Addresses</a>
			<a class="p-4 text-xl font-medium bg-neutral-100 text-neutral-800" href="/orders">Orders</a>
			<a class="p-4 text-xl font-medium bg-neutral-100 text-neutral-800" href="/settings">Settings</a>
			<a class="p-4 text-xl font-medium bg-neutral-100 text-neutral-800" href="/">Logout</a>

		</nav>

	</section>

</main>

<Footer />
