<script>
	export let title = "";
</script>

<div class="w-full min-h-screen h-full flex items-center justify-center">
	<div class="max-w-[600px] w-full mx-auto p-8 bg-white rounded-lg border border-neutral-100">

		<div class="mb-10">
			<a href="/">
				<img src="/logo-inverted.svg" alt="Logo" />
			</a>
		</div>

		<h1 class="text-3xl font-semibold mb-8 text-neutral-800">{ title }</h1>

		<slot />

	</div>
</div>
