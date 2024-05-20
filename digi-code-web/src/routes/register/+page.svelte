<script>
	import AuthCard from "$lib/components/AuthCard.svelte";

	const register = async () => {
		fetch("http://localhost:8080/api/v1/auth", {
			method: "POST",
			body: JSON.stringify({
				email: "berkay@berkaycubuk.com",
				password: "password",
			}),
			headers: {
				"Content-type": "application/json; charset=UTF-8"
			},
		});
	}
</script>

<AuthCard title="Create a new account">
	<form class="flex flex-col gap-4">

		<div class="grid grid-cols-2 gap-4">

			<div class="flex flex-col gap-2">
				<label for="firstName" class="text-neutral-600 font-light">First name</label>
				<input id="firstName" type="text" class="input" />
			</div>

			<div class="flex flex-col gap-2">
				<label for="lastName" class="text-neutral-600 font-light">Last name</label>
				<input id="lastName" type="text" class="input" />
			</div>

		</div>

		<div class="flex flex-col gap-2">
			<label for="email" class="text-neutral-600 font-light">E-mail</label>
			<input id="email" type="email" class="input" />
		</div>

		<div class="flex flex-col gap-2">
			<label for="password" class="text-neutral-600 font-light">Password</label>
			<input id="password" type="email" class="input" />
		</div>

		<div>
			<button class="button" on:click={register}>Register</button>
		</div>

		<p class="font-light text-neutral-600">
			Already have an account? <a class="font-normal text-neutral-800" href="/login">Login</a> to your account.
		</p>

	</form>
</AuthCard>
