<script>
	import ProductReview from "./ProductReview.svelte";

</script>
<div>

	<h2 class="font-medium text-2xl mb-6">Reviews</h2>

	<p class="text-neutral-600 mb-6">This product have 18 reviews.</p>

	<div class="flex flex-col gap-8">

		<ProductReview comment="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus urna mi, posuere in convallis ut, tempus id tellus. Phasellus pulvinar massa id libero porttitor, sed volutpat massa faucibus." stars={4.3} author="Berkay" reviewedAt="May 18, 2024" />

		<ProductReview comment="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus urna mi, posuere in convallis ut, tempus id tellus. Phasellus pulvinar massa id libero porttitor, sed volutpat massa faucibus." stars={1.9} author="Berkay" reviewedAt="May 18, 2024" />

		<ProductReview comment="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus urna mi, posuere in convallis ut, tempus id tellus. Phasellus pulvinar massa id libero porttitor, sed volutpat massa faucibus." stars={4.0} author="Berkay" reviewedAt="May 18, 2024" />

	</div>

</div>
