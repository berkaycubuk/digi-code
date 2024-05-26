<script>
	export let items = [];
</script>

<div class="flex gap-2 font-light text-neutral-600">
	{#each items as item, i}
		{#if i == items.length - 1}
		<div class="text-neutral-800 font-normal">{item.text}</div>
		{:else}
		<a href={item.href}>{item.text}</a>
		{/if}
		{#if i != items.length - 1}
		<div>/</div>
		{/if}
	{/each}
</div>
