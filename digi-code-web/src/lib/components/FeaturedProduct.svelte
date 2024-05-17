<script>
	export let title = "";
	export let image = "";
</script>

<div class="relative featured-product rounded-xl">
	<div class="featured-product__filter absolute left-0 top-0 w-full h-full rounded-xl"></div>
	<div class="w-full h-full">
		<img src={ image } alt={ title } class="w-full h-full object-cover rounded-xl" />
	</div>
	<div class="absolute bottom-0 left-0 w-full p-6">
		<h3 class="text-4xl text-white">{ title }</h3>
	</div>
</div>

<style>
	.featured-product {
		transition: all .5s;
		transform: rotate3d(0, 10, 1, 25deg);
		box-shadow: 6px 2px 20px rgba(0,0,0,.25);
		cursor: pointer;
	}

	.featured-product__filter {
		transition: all .5s;
		background: rgba(0,0,0,.8);
	}

	.featured-product:hover {
		transform: none;
		box-shadow: none;
	}

	.featured-product:hover .featured-product__filter {
		background: rgba(0,0,0,.3);
	}
</style>
