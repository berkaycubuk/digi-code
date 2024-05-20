<script>
	import { onMount } from 'svelte';
	import Swiper from 'swiper';
	import 'swiper/css';
	import ProductCard from './ProductCard.svelte';

	onMount(() => {
		const slider = new Swiper('.sp-slider', {
			slidesPerView: 4,
			spaceBetween: 10,
		});
	});
</script>

<section class="py-10">

	<div class="container mx-auto px-6">

		<h2 class="font-medium text-2xl mb-6">Similiar Products</h2>

		<div class="swiper sp-slider">
			<div class="swiper-wrapper">
				<div class="swiper-slide">
					<ProductCard image="https://images.unsplash.com/photo-1596162954151-cdcb4c0f70a8?q=80&w=1974&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D" title="Chair" stars={4.5} />
				</div>
				<div class="swiper-slide">
					<ProductCard image="https://images.unsplash.com/photo-1596162954151-cdcb4c0f70a8?q=80&w=1974&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D" title="Chair" stars={4.5} />
				</div>
				<div class="swiper-slide">
					<ProductCard image="https://images.unsplash.com/photo-1596162954151-cdcb4c0f70a8?q=80&w=1974&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D" title="Chair" stars={4.5} />
				</div>
				<div class="swiper-slide">
					<ProductCard image="https://images.unsplash.com/photo-1596162954151-cdcb4c0f70a8?q=80&w=1974&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D" title="Chair" stars={4.5} />
				</div>
				<div class="swiper-slide">
					<ProductCard image="https://images.unsplash.com/photo-1596162954151-cdcb4c0f70a8?q=80&w=1974&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D" title="Chair" stars={4.5} />
				</div>
				<div class="swiper-slide">
					<ProductCard image="https://images.unsplash.com/photo-1596162954151-cdcb4c0f70a8?q=80&w=1974&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D" title="Chair" stars={4.5} />
				</div>
			</div>
		</div>

	</div>

</section>
