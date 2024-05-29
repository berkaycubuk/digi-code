<script>
	import Header from "$lib/components/Header.svelte";
	import Footer from "$lib/components/Footer.svelte";
	import { getCookie, deleteCookie } from "$lib/cookie";
	import { goto } from '$app/navigation';
	import { onMount } from "svelte";

	const logout = () => {
		deleteCookie("auth_token");

		goto("/");
	}

	onMount(() => {
		if (getCookie("auth_token") == "") goto("/");
	})
</script>

<Header addSpace={true} />

<main class="grow">

	<section class="container m-auto px-6 py-10">

		<div class="bg-neutral-100 p-4 rounded-t-lg">
			<h1 class="text-3xl font-bold">Profile</h1>

			<div class="mt-4">
				<div class="text-xl font-light">Berkay Çubuk</div>
			</div>
		</div>

		<nav class="flex flex-col">

			<a class="p-4 text-xl font-medium bg-neutral-100 text-neutral-800" href="/addresses">Addresses</a>
			<a class="p-4 text-xl font-medium bg-neutral-100 text-neutral-800" href="/orders">Orders</a>
			<a class="p-4 text-xl font-medium bg-neutral-100 text-neutral-800" href="/settings">Settings</a>
			<button class="p-4 text-xl text-left font-medium bg-neutral-100 text-neutral-800" on:click={logout}>Logout</button>

		</nav>

	</section>

</main>

<Footer />
