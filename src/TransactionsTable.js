import React, { useState, useEffect } from 'react';
import axios from 'axios';

const TransactionsTable = ({ selectedMonth, searchQuery, setSearchQuery, page, setPage }) => {
  const [transactions, setTransactions] = useState([]);

  useEffect(() => {
    const fetchData = async () => {
      try {
        const response = await axios.get(`/api/transactions?month=${selectedMonth}&search=${searchQuery}&page=${page}`);
        setTransactions(response.data);
      } catch (error) {
        console.error('Error fetching transactions:', error);
      }
    };

    fetchData();
  }, [selectedMonth, searchQuery, page]);

  const handleSearchChange = (e) => {
    setSearchQuery(e.target.value);
  };

  const handleNextPage = () => {
    setPage(page + 1);
  };

  const handlePrevPage = () => {
    setPage(page - 1);
  };

  return (
    <div className="transactions-table">
      <input type="text" value={searchQuery} onChange={handleSearchChange} placeholder="Search transactions..." />
      <table>
        <thead>
          <tr>
            <th>Title</th>
            <th>Description</th>
            <th>Price</th>
          </tr>
        </thead>
        <tbody>
          {transactions.map((transaction) => (
            <tr key={transaction.id}>
              <td>{transaction.title}</td>
              <td>{transaction.description}</td>
              <td>{transaction.price}</td>
            </tr>
          ))}
        </tbody>
      </table>
      <div className="pagination">
        <button onClick={handlePrevPage} disabled={page === 1}>Previous</button>
        <span>Page {page}</span>
        <button onClick={handleNextPage}>Next</button>
      </div>
    </div>
  );
};

export default TransactionsTable;
