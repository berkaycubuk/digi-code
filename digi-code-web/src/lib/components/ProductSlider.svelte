<script>
	import Swiper from 'swiper';
	import 'swiper/css';

	import { onMount } from 'svelte';

	onMount(() => {
		const thumbs = new Swiper('.thumbs', {
			freeMode: true,
			slidesPerView: 4,
			spaceBetween: 10,
			watchSlidesProgress: true,
		});

		const slider = new Swiper('.slider', {
			spaceBetween: 10,
			navigation: {
				nextEl: ".swiper-button-next",
				prevEl: ".swiper-button-prev",
			},
			thumbs: {
				swiper: thumbs
			}
		});
	});
</script>

<div class="flex flex-col gap-3">

	<div class="swiper slider w-full">
		<div class="swiper-wrapper">
			
			<div class="swiper-slide">
				<img src="https://images.unsplash.com/photo-1596162954151-cdcb4c0f70a8?q=80&w=1974&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D" alt="Chair #1" class="w-full h-[600px] object-cover rounded-lg" />
			</div>
			
			<div class="swiper-slide">
				<img src="https://images.unsplash.com/photo-1506898667547-42e22a46e125?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NDB8fGNoYWlyfGVufDB8fDB8fHww" alt="Chair #2" class="w-full h-[600px] object-cover rounded-lg" />
			</div>

		</div>

		<div class="swiper-button-next"></div>
		<div class="swiper-button-prev"></div>
	</div>

	<div class="swiper thumbs w-full" thumbsslider="">
		<div class="swiper-wrapper">
			
			<div class="swiper-slide">
				<img src="https://images.unsplash.com/photo-1596162954151-cdcb4c0f70a8?q=80&w=1974&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D" alt="Chair #1" class="w-full h-[140px] object-cover rounded-lg" />
			</div>
			
			<div class="swiper-slide">
				<img src="https://images.unsplash.com/photo-1506898667547-42e22a46e125?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NDB8fGNoYWlyfGVufDB8fDB8fHww" alt="Chair #2" class="w-full h-[140px] object-cover rounded-lg" />
			</div>

		</div>
	</div>
	
</div>
