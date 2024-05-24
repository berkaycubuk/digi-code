<script>
	import StarGrading from '$lib/components/StarGrading.svelte';
	import ProductVariantOption from '$lib/components/ProductVariantOption.svelte';

	export let title = "";
	export let price;
	export let rating;
</script>

<div>
	<div class="mb-2 text-neutral-500 font-medium">Chair Co.</div>

	<h1 class="text-4xl font-semibold mb-3">{title}</h1>

	<div class="flex items-center justify-between">
		<div class="flex items-end gap-2 mb-2">
			<div class="text-3xl font-semibold text-neutral-800">{price}</div>
			<div class="text-lg text-neutral-800">EUR</div>
		</div>

		<div class="flex flex-col gap-1 mb-2 items-end">

			<StarGrading stars={rating} />

			<a class="text-blue-600 text-sm" href="/">(87 Reviews)</a>
			
		</div>
	</div>

	<p class="text-lg text-neutral-600 mb-3">Some quick explanation about the product, so people can understand a bit.</p>

	<div class="flex items-center gap-3 mb-4">

		<ProductVariantOption image="https://images.unsplash.com/photo-1596162954151-cdcb4c0f70a8?q=80&w=1974&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D" name="Blue" active={true} />

		<ProductVariantOption image="https://images.unsplash.com/photo-1595532398736-d9d215f8dfe6?q=80&w=1974&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D" name="Red" active={false} />

	</div>

	<div>

		<button class="button flex items-center gap-2 text-lg">
		<svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="1.5" stroke="currentColor" class="w-6 h-6">
		  <path stroke-linecap="round" stroke-linejoin="round" d="M2.25 3h1.386c.51 0 .955.343 1.087.835l.383 1.437M7.5 14.25a3 3 0 0 0-3 3h15.75m-12.75-3h11.218c1.121-2.3 2.1-4.684 2.924-7.138a60.114 60.114 0 0 0-16.536-1.84M7.5 14.25 5.106 5.272M6 20.25a.75.75 0 1 1-1.5 0 .75.75 0 0 1 1.5 0Zm12.75 0a.75.75 0 1 1-1.5 0 .75.75 0 0 1 1.5 0Z" />
		</svg>
		Add to cart
		</button>

	</div>
</div>
