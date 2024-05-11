import React from 'react';

const TransactionsStatistics = ({ selectedMonth }) => {
  // Generate random statistics data based on the selected month
  const generateRandomStatistics = () => {
    const totalAmount = Math.floor(Math.random() * 5000) + 1000; // Random total amount between 1000 and 6000
    const totalSoldItems = Math.floor(Math.random() * 50) + 1; // Random total sold items between 1 and 50
    const totalNotSoldItems = Math.floor(Math.random() * 20) + 1; // Random total not sold items between 1 and 20
    return { totalAmount, totalSoldItems, totalNotSoldItems };
  };

  const statistics = generateRandomStatistics();

  return (
    <div className="transactions-statistics">
      <h2>Transactions Statistics for {selectedMonth}</h2>
      <div>
        <p>Total Amount of Sale: {statistics.totalAmount}</p>
        <p>Total Sold Items: {statistics.totalSoldItems}</p>
        <p>Total Not Sold Items: {statistics.totalNotSoldItems}</p>
      </div>
    </div>
  );
};

export default TransactionsStatistics;
