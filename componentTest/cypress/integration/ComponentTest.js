describe("test api of Item component",()=> { 
    it('should retur all items in database',() => {
		cy.request('http://localhost:8080/all-items').as('items')
		cy.get('@items').should((response) => {
	      expect(response.status).to.eq(200)
         expect(response.body).to.deep.eq([{"id":1001,"name":"Item1","price":10,"quantity":20,"value":200},{"id":1002,"name":"Item2","price":5,"quantity":10,"value":50},{"id":1003,"name":"Item3","price":15,"quantity":2,"value":30}])
			
	  
       })
	})

	it('should return hello world',() => {
	   cy.request('http://localhost:8080/hello-world').as('message')
	   cy.get('@message').should((response) => {
	      expect(response.status).to.eq(200)
          expect(response.body).to.eq('Hello World')
	     
       })
	})
})