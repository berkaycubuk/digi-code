<script>
	import AuthCard from "$lib/components/AuthCard.svelte";
</script>

<AuthCard title="Login to your account">
	<form class="flex flex-col gap-4">

		<div class="flex flex-col gap-2">
			<label for="email" class="text-neutral-600 font-light">E-mail</label>
			<input id="email" type="email" class="input" />
		</div>

		<div class="flex flex-col gap-2">
			<label for="password" class="text-neutral-600 font-light">Password</label>
			<input id="password" type="email" class="input" />
		</div>

		<div>
			<button class="button">Login</button>
		</div>

		<p class="font-light text-neutral-600">
			Don't have an account? <a class="font-normal text-neutral-800" href="/register">Create new account</a>.
		</p>

	</form>
</AuthCard>
