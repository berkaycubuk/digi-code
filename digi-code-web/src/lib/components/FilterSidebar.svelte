<script>
	import StarGrading from "./StarGrading.svelte";

</script>
<div class="text-xl font-medium">Filters</div>

<div class="mt-4">

	<div class="text font-medium mb-1">Category</div>

	<div class="flex flex-col gap-1">

		<a href="/" class="block w-fit text-sm">Chairs</a>

		<a href="/" class="block w-fit text-sm">Stoves</a>

		<a href="/" class="block w-fit text-sm">Tables</a>

		<a href="/" class="block w-fit text-sm">Fridges</a>

		<a href="/" class="block w-fit text-sm">Pans</a>

	</div>

</div>

<div class="mt-4">

	<div class="text font-medium mb-1">Customer Reviews</div>

	<div class="flex flex-col gap-1">

		<StarGrading stars={5} size="small" />
		<StarGrading stars={4} size="small" />
		<StarGrading stars={3} size="small" />
		<StarGrading stars={2} size="small" />
		<StarGrading stars={1} size="small" />

	</div>

</div>

<div class="mt-4">

	<div class="text font-medium mb-1">Brands</div>

	<div class="flex flex-col gap-1">

		<label class="w-fit ">
			<input type="checkbox" />
			<span class="text-sm">
				Brand #1
			</span>
		</label>

		<label class="w-fit ">
			<input type="checkbox" />
			<span class="text-sm">
				Brand #2
			</span>
		</label>

		<label class="w-fit ">
			<input type="checkbox" />
			<span class="text-sm">
				Brand #3
			</span>
		</label>

	</div>

</div>

<div class="mt-4">

	<div class="text font-medium mb-1">Price Range</div>

	<div class="flex flex-col gap-1">

		<StarGrading stars={5} size="small" />
		<StarGrading stars={4} size="small" />
		<StarGrading stars={3} size="small" />
		<StarGrading stars={2} size="small" />
		<StarGrading stars={1} size="small" />

	</div>

</div>
