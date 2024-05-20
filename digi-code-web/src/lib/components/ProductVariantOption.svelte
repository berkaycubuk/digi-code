<script>
	export let image;
	export let name;
	export let active;
</script>

<div class="{ active ? '' : 'opacity-40'}">
	<img src={ image } alt={ name } class="w-20 h-20 object-cover rounded mb-1 { active ? 'border-2 border-neutral-800' : ''}" />
	<div class="text-center">{ name }</div>
</div>
