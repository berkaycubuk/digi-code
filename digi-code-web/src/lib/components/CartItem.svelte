<script>
	export let image = "";
	export let name = "";
	export let quantity = 1;
	export let price = "99,99";
</script>

<div class="grid grid-cols-3 gap-8">

	<img src={ image } alt={ name } class="w-[200px] h-[200px] object-cover rounded" />

	<div class="flex flex-col gap-2">
		<h2 class="text-2xl font-medium text-neutral-900">{ name }</h2>
		<div class="font-light text-neutral-600">Color: Gray</div>

		<div class="flex gap-4 items-center">
			<div class="flex items-center gap-2">
				<div class="text-sm text-neutral-800">Quantity</div>
				<select class="px-2 py-1 border border-neutral-300 bg-neutral-200 rounded">
					<option>1</option>
					<option>2</option>
					<option>3</option>
					<option>4</option>
					<option>5</option>
				</select>
			</div>
			<button class="block w-fit text-blue-600 text-sm">Delete</button>
			<button class="block w-fit text-blue-600 text-sm">Save for later</button>
		</div>
	</div>

	<div class="flex flex-col items-end">
		<div class="text-lg text-neutral-900 font-medium">€{ price }</div>
	</div>
	
</div>
