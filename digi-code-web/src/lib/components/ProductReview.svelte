<script>
	import StarGrading from "$lib/components/StarGrading.svelte";

	export let comment = "";
	export let stars = 4.8;
	export let author = "Joe Vien";
	export let reviewedAt = "April 3, 2024";
</script>

<div>
	<p class="text-neutral-600 font-light mb-1">
		{ comment }
	</p>

	<StarGrading stars={stars} />

	<div class="mt-1">{ author }</div>
	<div class="text-sm text-neutral-600">Reviewed on { reviewedAt }</div>
</div>
