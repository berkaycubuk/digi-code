<script>
	import StarGrading from "./StarGrading.svelte";

	export let image = "";
	export let title = "";
	export let stars = 4.8;
	export let price = "200,00";
</script>

<div class="">
	<img class="w-full h-[250px] object-cover rounded" src={ image } alt={ title } />
	<div class="mt-2 mb-1 text-xl font-medium">{ title }</div>
	<StarGrading stars={ stars } size="small" />
	<div class="flex items-end gap-1 mt-1">
		<div class="text-xl font-medium text-neutral-900">{ price }</div>
		<div class="text-sm text-neutral-900">EUR</div>
	</div>
</div>
