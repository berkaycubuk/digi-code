<script>
	import Header from "$lib/components/Header.svelte";
	import Footer from "$lib/components/Footer.svelte";
	import FilterSidebar from "../../lib/components/FilterSidebar.svelte";
	import ProductCard from "../../lib/components/ProductCard.svelte";
</script>

<Header glassOnScroll={false} addSpace={true} />

<main class="grow">

	<div class="container mx-auto px-6 py-10 flex gap-8">


		<div class="w-[250px]">

			<FilterSidebar />

		</div>

		<div class="grow">

			<h1 class="text-2xl font-medium mb-2">Results</h1>

			<p class="font-light text-neutral-600">Found 28 products.</p>

			<div class="grid grid-cols-4 gap-6 mt-10">

				<a href="/">
					<ProductCard title="Kitchen Set" image="https://images.unsplash.com/photo-1596552183299-000ef779e88d?q=80&w=1964&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D" price="1.899,99"/>
				</a>

				<a href="/">
					<ProductCard title="Kitchen Set" image="https://images.unsplash.com/photo-1596552183299-000ef779e88d?q=80&w=1964&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D" price="1.899,99"/>
				</a>

				<a href="/">
					<ProductCard title="Kitchen Set" image="https://images.unsplash.com/photo-1596552183299-000ef779e88d?q=80&w=1964&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D" price="1.899,99"/>
				</a>

				<a href="/">
					<ProductCard title="Kitchen Set" image="https://images.unsplash.com/photo-1596552183299-000ef779e88d?q=80&w=1964&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D" price="1.899,99"/>
				</a>

				<a href="/">
					<ProductCard title="Kitchen Set" image="https://images.unsplash.com/photo-1596552183299-000ef779e88d?q=80&w=1964&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D" price="1.899,99"/>
				</a>

				<a href="/">
					<ProductCard title="Kitchen Set" image="https://images.unsplash.com/photo-1596552183299-000ef779e88d?q=80&w=1964&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D" price="1.899,99"/>
				</a>

				<a href="/">
					<ProductCard title="Kitchen Set" image="https://images.unsplash.com/photo-1596552183299-000ef779e88d?q=80&w=1964&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D" price="1.899,99"/>
				</a>

				<a href="/">
					<ProductCard title="Kitchen Set" image="https://images.unsplash.com/photo-1596552183299-000ef779e88d?q=80&w=1964&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D" price="1.899,99"/>
				</a>

			</div>

		</div>


	</div>

</main>

<Footer />
