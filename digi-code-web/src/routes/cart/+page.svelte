<script>
	import Header from "$lib/components/Header.svelte";
	import Footer from "$lib/components/Footer.svelte";
	import CartItem from "../../lib/components/CartItem.svelte";
</script>

<Header glassOnScroll={false} addSpace={true} />

<main class="grow">

	<div class="container mx-auto px-6 py-10">

		<h1 class="text-4xl font-medium mb-8">Cart</h1>

		<div class="bg-neutral-100 border border-neutral-200 rounded flex gap-8">

			<div class="grow p-6 flex flex-col gap-8">

				<CartItem image="https://images.unsplash.com/photo-1623114112815-74a4b9fe505d?q=80&w=1974&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D" name="Grand Stove XL" price="299,99" />

				<CartItem image="https://images.unsplash.com/photo-1623114112815-74a4b9fe505d?q=80&w=1974&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D" name="Grand Stove XL" price="299,99" />

				<CartItem image="https://images.unsplash.com/photo-1623114112815-74a4b9fe505d?q=80&w=1974&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D" name="Grand Stove XL" price="299,99" />

			</div>

			<div class="w-[300px] border-l border-neutral-200 p-6">
				<h2 class="text-xl font-medium text-neutral-800 mb-4">Order Summary</h2>

				<div class="flex items-center gap-1 mb-4">
					<div class="font-medium text-neutral-800">Subtotal:</div>
					<div class="text-neutral-600">€299,99</div>
				</div>

				<button class="button">Proceed to checkout</button>
			</div>

		</div>

	</div>

</main>

<Footer />
