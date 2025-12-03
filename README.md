Introduction:

  This is a service that allows products to be listed along with their name, price, description, and ID.
  Items are stored in a database, and are displayed in a list where they can be deleted if desired.

User Documentation:

  Upon starting the app (found in the 'Final' file), go to localhost:8080/ on your preferred web browser. You will see a page called 'Product List' that shows a form you can fill out to add products to a list.
  After filling out the three fields, click the 'add' button. The product will then be added to a database and displayed in the list at the bottom.
  Any product in the list can be deleted using the 'Delete' button next to each item.

How Service Would Be Hosted:

  The website would be hosted on an Amamon EC2 instance, with the data being stored using a DynamoDB table. 
