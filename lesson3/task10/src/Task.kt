// Return the set of products that were ordered by every customer
fun Shop.getSetOfProductsOrderedByEveryCustomer(): Set<Product> =
        customers.fold(
                customers.first().orders.flatMap { it.products }.toSet(),
                { products, customer ->
                    products.intersect(customer.orders.flatMap { it.products })
                }
        )

