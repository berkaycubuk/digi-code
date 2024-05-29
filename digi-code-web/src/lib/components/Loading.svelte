<script>

</script>

<div>
	<div class="loading-animation bg-blue-600 rounded-full"></div>
</div>

<style>
	.loading-animation {
		width: 40px;
		height: 40px;
		animation-name: loading;
		animation-duration: 2s;
		animation-iteration-count: infinite;
	}

	@keyframes loading {
		0% { width: 40px; height: 40px; }
		50% { width: 10px; height: 10px; }
		100% { width: 40px; height: 40px; }
	}
</style>
