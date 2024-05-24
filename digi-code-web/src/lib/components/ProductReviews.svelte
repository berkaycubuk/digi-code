<script>
	import ProductReview from "./ProductReview.svelte";
	import productCommentService from "$lib/services/productCommentService";

	export let comments;

	let comment;
	let rating;

	const submitComment = async () =>{
		try {
			const response = await productCommentService.create({
				comment,
				rating
			})
			console.log(response)
		} catch(err) {
			console.log(err)
		}
	}
</script>
<div>

	<h2 class="font-medium text-2xl mb-6">Reviews</h2>

	{#if comments != null}
	<p class="text-neutral-600 mb-6">This product have 18 reviews.</p>

	<div class="flex flex-col gap-8">

		{#each comments as comment}
		<ProductReview comment={comment.comment} stars={comment.rating} author={comment.user.firstName + " " + comment.user.lastName} reviewedAt={comment.createdDate} />
		{/each}

	</div>
	{/if}

	<form class="flex flex-col gap-2">

		<div class="flex flex-col gap-1">
			<label for="comment">Comment</label>
			<textarea id="comment" class="input" bind:value={comment}></textarea>
		</div>

		<div class="flex flex-col gap-1">
			<label for="rating">Rating</label>
			<input type="text" id="rating" class="input" bind:value={rating} />
		</div>

		<div>
			<button class="button" on:click={submitComment}>Submit</button>
		</div>

	</form>

</div>
