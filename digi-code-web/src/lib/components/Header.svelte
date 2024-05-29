<script>
	import { onDestroy, onMount } from "svelte";

	export let glassOnScroll = false;
	export let addSpace = false;

	let glassBg = glassOnScroll;

	const handleScroll = () => {
		glassBg = window.scrollY < 100;
	}

	onMount(() => {
		if (glassOnScroll) {
			glassBg = window.scrollY < 100;
			window.addEventListener('scroll', handleScroll);

			onDestroy(() => {
				window.removeEventListener('scroll', handleScroll);
			});
		}
	});
</script>

<header id="header" class="{ glassBg ? 'backdrop-blur border-b border-white/20' : 'bg-black' } fixed top-0 left-0 w-full z-[999]">
	<div class="container mx-auto p-6 flex items-center gap-8 justify-between">
		<div>
			<a href="/">
				<img src="/logo.svg" alt="Logo" class="h-8" />
			</a>
		</div>

		<div class="grow">
			<input type="text" placeholder="Search products" class="px-4 py-3 rounded bg-black/20 text-neutral-200 border border-white/20 outline-none max-w-[600px] w-full" />
		</div>

		<div class="flex gap-6 items-center">

			<a href="/cart">
				<svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="1.5" class="w-6 h-6 stroke-neutral-100">
				  <path stroke-linecap="round" stroke-linejoin="round" d="M2.25 3h1.386c.51 0 .955.343 1.087.835l.383 1.437M7.5 14.25a3 3 0 0 0-3 3h15.75m-12.75-3h11.218c1.121-2.3 2.1-4.684 2.924-7.138a60.114 60.114 0 0 0-16.536-1.84M7.5 14.25 5.106 5.272M6 20.25a.75.75 0 1 1-1.5 0 .75.75 0 0 1 1.5 0Zm12.75 0a.75.75 0 1 1-1.5 0 .75.75 0 0 1 1.5 0Z" />
				</svg>
			</a>
			<a href="/profile">
				<svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="1.5" class="w-6 h-6 stroke-neutral-100">
				  <path stroke-linecap="round" stroke-linejoin="round" d="M17.982 18.725A7.488 7.488 0 0 0 12 15.75a7.488 7.488 0 0 0-5.982 2.975m11.963 0a9 9 0 1 0-11.963 0m11.963 0A8.966 8.966 0 0 1 12 21a8.966 8.966 0 0 1-5.982-2.275M15 9.75a3 3 0 1 1-6 0 3 3 0 0 1 6 0Z" />
				</svg>
			</a>
		
		</div>
	</div>
</header>

{#if addSpace}
<div class="h-[96px]"></div>
{/if}

<style>
	#header {
		transition: all 2s, border-bottom-width 0s, border-color 0s;
	}
</style>
