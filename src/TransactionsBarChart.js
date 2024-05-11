import React, { useState, useEffect } from 'react';
import axios from 'axios';
import { BarChart, Bar, XAxis, YAxis, CartesianGrid, Tooltip, Legend, ResponsiveContainer } from 'recharts';

const TransactionsBarChart = ({ selectedMonth }) => {
  const [barChartData, setBarChartData] = useState([]);

  useEffect(() => {
    // Generate random data based on the selected month
    const generateRandomData = () => {
      const data = [];
      const ranges = ['0-100', '101-200', '201-300', '301-400', '401-500'];
      ranges.forEach(range => {
        const count = Math.floor(Math.random() * 50) + 1; // Random count between 1 and 50
        data.push({ range, count });
      });
      setBarChartData(data);
    };

    generateRandomData();
  }, [selectedMonth]);

  return (
    <div className="transactions-bar-chart">
      <h2>Transactions Bar Chart for {selectedMonth}</h2>
      <ResponsiveContainer width="100%" height={300}>
        <BarChart
          data={barChartData}
          margin={{ top: 20, right: 30, left: 20, bottom: 5 }}
        >
          <CartesianGrid strokeDasharray="3 3" />
          <XAxis dataKey="range" />
          <YAxis />
          <Tooltip />
          <Legend />
          <Bar dataKey="count" fill="#8884d8" />
        </BarChart>
      </ResponsiveContainer>
    </div>
  );
};

export default TransactionsBarChart;
